class InformationEvent {
    static #instance = null;
    static getInstance() {
        if(this.#instance == null) {
            this.#instance = new InformationEvent();
        }
        return this.#instance;
    }

    addEventPhotoChangeClick() {
        const infoPhoto = document.querySelector(".info-photo");
        infoPhoto.onclick = () => {
            const photoFile = document.querySelector(".photo-file");
            photoFile.click();
        }
    }

    addEventPhotoChange() {
        const photoFile = document.querySelector(".photo-file");
        photoFile.onchange = () => {
            FileService.getInstance().changePhoto();
        }
    }

    addEventAboutMeModifyClick() {
        const aboutMeModifyButton = document.querySelector(".m-aboutme");
        aboutMeModifyButton.onclick = () => {
            const aboutMeSaveButton = document.querySelector(".s-aboutme");
            aboutMeSaveButton.classList.remove("button-hidden");
            aboutMeModifyButton.classList.add("button-hidden");

            const infoInputContainers = document.querySelectorAll(".info-input-container");
            infoInputContainers.forEach(infoInputContainer => {
                infoInputContainer.querySelector(".info-input").disabled = false;
            });
        }
    }

    addEventAboutMeSaveClick() {
        const aboutMeSaveButton = document.querySelector(".s-aboutme");
        aboutMeSaveButton.onclick = () => {
            const aboutMeModifyButton = document.querySelector(".m-aboutme");
            aboutMeModifyButton.classList.remove("button-hidden");
            aboutMeSaveButton.classList.add("button-hidden");

            const infoInputContainers = document.querySelectorAll(".info-input-container");
            const userInfo = InformationService.getInstance().userInfo();

            infoInputContainers.forEach(infoInputContainer => {
                const infoInput = infoInputContainer.querySelectorAll(".info-input");
                console.log(infoInput.id);
                infoInput.disabled=true;
            });

            console.log(userInfo);
            console.log(InformationService.getInstance().userInfo);
        }
    }

    addEventIntroduceModifyClick() {
        const introduceModifyButton = document.querySelector(".m-introduce");
        introduceModifyButton.onclick = () => {
            const introduceSaveButton = document.querySelector(".s-introduce");
            introduceSaveButton.classList.remove("button-hidden");
            introduceModifyButton.classList.add("button-hidden");
            const introduceInput = document.querySelector(".introduce-input");
            introduceInput.disabled = false;
        }
    }

    addEventIntroduceSaveClick() {
        const introduceSaveButton = document.querySelector(".s-introduce");
        introduceSaveButton.onclick = () => {
            const introduceModifyButton = document.querySelector(".m-introduce");
            introduceModifyButton.classList.remove("button-hidden");
            introduceSaveButton.classList.add("button-hidden");
            const introduceInput = document.querySelector(".introduce-input");
            introduceInput.disabled = true;
        }
    }
}

class InformationService {
    static #instance = null;
    static getInstance() {
        if(this.#instance == null) {
            this.#instance = new InformationService();
        }
        return this.#instance;
    }
    userInfo = {
        name: null,
        emaill : null,
        phone: null,
        gitHub:null,
        introduce:null
    };
    userInfo = {};
    loadInfo() {
        this.loadInfoPhoto();
    }
    loadInfoPhoto() {
        const infoPhotoImg  = document.querySelector(".info-photo img");
        const infoPhoto = localStorage.getItem("infoPhoto");
        if(infoPhoto == null) {
            infoPhotoImg.src = "./images/noimage.jpg";
        } else {
            infoPhotoImg.src = infoPhoto;
        }
    }
 }

class FileService {
    static #instance = null;
    static getInstance() {
        if(this.#instance == null) {
            this.#instance = new FileService();
        }
        return this.#instance;
    }

    changePhoto() {
        const photoForm = document.querySelector(".photo-form");
        const formData = new FormData(photoForm);
        const fileValue = formData.get("file");
        if(fileValue.size == 0) {
            return;
        } 
        this.showPreview(fileValue);
    }

    showPreview(fileValue) {
        const fileReader = new FileReader();

        fileReader.readAsDataURL(fileValue);

        fileReader.onload = (e) => {
            const photoImg = document.querySelector(".info-photo img");
            photoImg.src = e.target.result;
            localStorage.setItem("infoPhoto" , photoImg.src);
        }

        
    }
}
