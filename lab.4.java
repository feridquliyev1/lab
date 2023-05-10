const ilksayi = parseInt(prompt("Ilk sayiyini daxil edin:"));
const ikincisayi = parseInt(prompt("Ikinci sayiyini daxil edin:"));
let hasil = 0;
let cem = 1;
for (let i = ilksayi; i <= ikincisayi; i++) {
  hasil += i;
  cem *= i;
}
alert(`hasil: ${hasil}\ncem: ${cem}`);