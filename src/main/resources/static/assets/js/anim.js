// ===== Простая анимация при загрузке =====
document.addEventListener("DOMContentLoaded", () => {
    // все элементы с классом fade-in
    document.querySelectorAll('.fade-in').forEach(el => {
        el.style.animationDelay = el.dataset.delay || '0s';
        el.classList.add('fade-in');
    });

    // все элементы с классом slide-up
    document.querySelectorAll('.slide-up').forEach(el => {
        el.style.animationDelay = el.dataset.delay || '0s';
        el.classList.add('slide-up');
    });
});

// ===== Пример анимации кнопки при клике =====
document.querySelectorAll('form button').forEach(button => {
    button.addEventListener('mouseenter', () => {
        button.style.transform = 'scale(1.05)';
    });
    button.addEventListener('mouseleave', () => {
        button.style.transform = 'scale(1)';
    });
});
