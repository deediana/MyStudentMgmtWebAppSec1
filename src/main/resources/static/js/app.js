/**
 * app.js
 *
 * @author okalu
 * @since 2022-04-17
 */
"use strict";
console.log("hello3");
(function(){
    const btnOpenDialog = document.querySelector("#btnOpenDialog");
    if(btnOpenDialog) {
        btnOpenDialog.addEventListener("click", (event) => {
            // event.preventDefault();
            const dialog = document.querySelector("#dialog");
            dialog.showModal();
        });
    }
})();